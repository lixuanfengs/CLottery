package cn.cactusli.clottery.interfaces.facade;

import cn.cactusli.clottery.application.process.deploy.IActivityDeployProcess;
import cn.cactusli.clottery.common.Result;
import cn.cactusli.clottery.domain.activity.model.aggregates.ActivityInfoLimitPageRich;
import cn.cactusli.clottery.domain.activity.model.req.ActivityInfoLimitPageReq;
import cn.cactusli.clottery.domain.activity.model.vo.ActivityVO;
import cn.cactusli.clottery.interfaces.assembler.IMapping;
import cn.cactusli.clottery.rpc.deploy.ICLotteryActivityDeploy;
import cn.cactusli.clottery.rpc.deploy.dto.ActivityDTO;
import cn.cactusli.clottery.rpc.deploy.req.ActivityPageReq;
import cn.cactusli.clottery.rpc.deploy.res.DeployActivityRes;
import com.alibaba.fastjson.JSON;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * Package: cn.cactusli.clottery.interfaces.facade
 * Description:
 *  抽奖活动部署
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/5/8 9:49
 * @Github https://github.com/lixuanfengs
 */
@DubboService
public class CLotteryActivityDeploy implements ICLotteryActivityDeploy {

    private Logger logger = LoggerFactory.getLogger(CLotteryActivityDeploy.class);

    @Resource
    private IActivityDeployProcess activityDeploy;

    @Resource
    private IMapping<ActivityVO, ActivityDTO> activityIMapping;

    @Override
    public DeployActivityRes queryActivityListByPageForErp(ActivityPageReq req) {

        try {
            // 1. 包装入参
            logger.info("活动部署分页数据查询开始 erpID：{}", req.getErpId());
            ActivityInfoLimitPageReq activityInfoLimitPageReq = new ActivityInfoLimitPageReq(req.getPage(), req.getRows());
            activityInfoLimitPageReq.setActivityId(req.getActivityId());
            activityInfoLimitPageReq.setActivityName(req.getActivityName());

            // 2. 查询结果
            ActivityInfoLimitPageRich activityInfoLimitPageRich = activityDeploy.queryActivityInfoLimitPage(activityInfoLimitPageReq);
            Long count = activityInfoLimitPageRich.getCount();
            List<ActivityVO> activityVOList = activityInfoLimitPageRich.getActivityVOList();

            // 3. 转换对象
            List<ActivityDTO> activityDTOList = activityIMapping.sourceToTarget(activityVOList);

            // 4. 封装数据
            DeployActivityRes activityRes = new DeployActivityRes(Result.buildSuccessResult());
            activityRes.setCount(count);
            activityRes.setActivityDTOList(activityDTOList);

            logger.info("活动部署分页数据查询完成 erpID：{} count：{}", req.getErpId(), count);

            // 5. 返回结果
            return activityRes;
        } catch (Exception e) {
            logger.error("活动部署分页数据查询失败 erpID：{} reqStr：{}", req.getErpId(), JSON.toJSON(req), e);
            return new DeployActivityRes(Result.buildErrorResult());

        }
    }
}
