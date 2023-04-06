package cn.cactusli.clottery.infrastructure.repository;

import cn.cactusli.clottery.common.Constants;
import cn.cactusli.clottery.domain.activity.model.vo.*;
import cn.cactusli.clottery.domain.activity.repository.IActivityRepository;
import cn.cactusli.clottery.infrastructure.dao.IActivityDao;
import cn.cactusli.clottery.infrastructure.dao.IAwardDao;
import cn.cactusli.clottery.infrastructure.dao.IStrategyDao;
import cn.cactusli.clottery.infrastructure.dao.IStrategyDetailDao;
import cn.cactusli.clottery.infrastructure.po.Activity;
import cn.cactusli.clottery.infrastructure.po.Award;
import cn.cactusli.clottery.infrastructure.po.Strategy;
import cn.cactusli.clottery.infrastructure.po.StrategyDetail;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: ActivityRepository
 * Package: cn.cactusli.clottery.infrastructure
 * Description:
 *
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/4 17:50
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@Component
public class ActivityRepository implements IActivityRepository {
    @Resource
    private IActivityDao activityDao;
    @Resource
    private IAwardDao awardDao;
    @Resource
    private IStrategyDao strategyDao;
    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Override
    public void addActivity(ActivityVO activity) {
        Activity req = new Activity();
        BeanUtils.copyProperties(activity, req);
        activityDao.insert(req);
    }

    @Override
    public void addAward(List<AwardVO> awardList) {
        List<Award> req = new ArrayList<>();
        for (AwardVO awardVO : awardList) {
            Award award = new Award();
            BeanUtils.copyProperties(awardVO, award);
            req.add(award);
        }
        awardDao.insertList(req);
    }

    @Override
    public void addStrategy(StrategyVO strategy) {
        Strategy req = new Strategy();
        BeanUtils.copyProperties(strategy, req);
        strategyDao.insert(req);
    }

    @Override
    public void addStrategyDetailList(List<StrategyDetailVO> strategyDetailList) {
        List<StrategyDetail> req = new ArrayList<>();
        for (StrategyDetailVO strategyDetailVO : strategyDetailList) {
            StrategyDetail strategyDetail = new StrategyDetail();
            BeanUtils.copyProperties(strategyDetailVO, strategyDetail);
            req.add(strategyDetail);
        }
        strategyDetailDao.insertList(req);
    }

    @Override
    public boolean alterStatus(Long activityId, Enum<Constants.ActivityState> beforeState, Enum<Constants.ActivityState> afterState) {
        AlterStateVO alterStateVO = new AlterStateVO(activityId,((Constants.ActivityState) beforeState).getCode(),((Constants.ActivityState) afterState).getCode());
        int count = activityDao.alterState(alterStateVO);
        return 1 == count;
    }

}
