/**   
* @Title: BaseRepository.java 
* @Package com.hdp.customerservice.repository 
* @Description: TODO
* @author new12304508_163_com   
* @date 2015年6月17日 下午2:12:56 
* @version V1.0   
*/
package com.c.springbootthymeleaf.reposiritory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<E, PK extends Serializable> extends JpaRepository<E, PK>,JpaSpecificationExecutor<E> {

}

