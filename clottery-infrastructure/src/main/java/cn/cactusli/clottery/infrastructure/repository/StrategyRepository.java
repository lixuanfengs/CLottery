package cn.cactusli.clottery.infrastructure.repository;

import cn.cactusli.clottery.domain.strategy.model.aggregates.StrategyRich;
import cn.cactusli.clottery.domain.strategy.model.vo.AwardBriefVO;
import cn.cactusli.clottery.domain.strategy.model.vo.StrategyBriefVO;
import cn.cactusli.clottery.domain.strategy.model.vo.StrategyDetailBriefVO;
import cn.cactusli.clottery.domain.strategy.repository.IStrategyRepository;
import cn.cactusli.clottery.infrastructure.dao.IAwardDao;
import cn.cactusli.clottery.infrastructure.dao.IStrategyDao;
import cn.cactusli.clottery.infrastructure.dao.IStrategyDetailDao;
import cn.cactusli.clottery.infrastructure.po.Award;
import cn.cactusli.clottery.infrastructure.po.Strategy;
import cn.cactusli.clottery.infrastructure.po.StrategyDetail;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: StrategyRepository
 * Package: cn.cactusli.clottery.infrastructure.repository
 * Description:
 *  策略表仓储服务
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/4 17:57
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@Component
public class StrategyRepository implements IStrategyRepository {

    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Resource
    private IAwardDao awardDao;

    @Override
    public StrategyRich queryStrategyRich(Long strategyId) {
        Strategy strategy = strategyDao.queryStrategy(strategyId);
        List<StrategyDetail> strategyDetailList = strategyDetailDao.queryStrategyDetailList(strategyId);

        StrategyBriefVO strategyBriefVO = new StrategyBriefVO();
        BeanUtils.copyProperties(strategy, strategyBriefVO);

        List<StrategyDetailBriefVO> strategyDetailBriefVOList = new ArrayList<>();
        for (StrategyDetail strategyDetail : strategyDetailList) {
            StrategyDetailBriefVO strategyDetailBriefVO = new StrategyDetailBriefVO();
            BeanUtils.copyProperties(strategyDetail, strategyDetailBriefVO);
            strategyDetailBriefVOList.add(strategyDetailBriefVO);
        }

        return new StrategyRich(strategyId, strategyBriefVO, strategyDetailBriefVOList);
    }

    @Override
    public AwardBriefVO queryAwardInfo(String awardId) {

        Award award = awardDao.queryAwardInfo(awardId);

        // 可以使用 BeanUtils.copyProperties(award, awardBriefVO)、或者基于ASM实现的Bean-Mapping，但在效率上最好的依旧是硬编码
        AwardBriefVO awardBriefVO = new AwardBriefVO();
        awardBriefVO.setAwardId(award.getAwardId());
        awardBriefVO.setAwardType(award.getAwardType());
        awardBriefVO.setAwardName(award.getAwardName());
        awardBriefVO.setAwardContent(award.getAwardContent());

        return awardBriefVO;
    }

    @Override
    public List<String> queryNoStockStrategyAwardList(Long strategyId) {
        return strategyDetailDao.queryNoStockStrategyAwardList(strategyId);
    }

    @Override
    public boolean deductStock(Long strategyId, String awardId) {
        StrategyDetail req = new StrategyDetail();
        req.setStrategyId(strategyId);
        req.setAwardId(awardId);
        int count = strategyDetailDao.deductStock(req);
        return count == 1;
    }
}
