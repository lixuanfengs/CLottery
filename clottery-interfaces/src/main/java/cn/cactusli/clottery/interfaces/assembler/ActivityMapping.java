package cn.cactusli.clottery.interfaces.assembler;

import cn.cactusli.clottery.domain.activity.model.vo.ActivityVO;
import cn.cactusli.clottery.rpc.deploy.dto.ActivityDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

/**
 * Package: cn.cactusli.clottery.interfaces.assembler
 * Description:
 *  活动对象转换配置
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/5/8 10:48
 * @Github https://github.com/lixuanfengs
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ActivityMapping extends IMapping<ActivityVO, ActivityDTO> {

    @Override
    List<ActivityDTO> sourceToTarget(List<ActivityVO> var1);
}
