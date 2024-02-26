package com.entity.view;

import com.entity.GudingzichanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 固定资产
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
@TableName("gudingzichan")
public class GudingzichanView  extends GudingzichanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GudingzichanView(){
	}
 
 	public GudingzichanView(GudingzichanEntity gudingzichanEntity){
 	try {
			BeanUtils.copyProperties(this, gudingzichanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
