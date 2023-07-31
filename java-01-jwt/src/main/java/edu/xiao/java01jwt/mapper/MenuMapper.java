package edu.xiao.java01jwt.mapper;

import edu.xiao.java01jwt.model.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xiaoning
 * @description 针对表【ums_menu(菜单表)】的数据库操作Mapper
 * @createDate 2023-07-21 20:18:27
 * @Entity edu.xiao.java01jwt.entity.Menu
 */
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {

}
