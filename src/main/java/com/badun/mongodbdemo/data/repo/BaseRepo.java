package com.badun.mongodbdemo.data.repo;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * Created by Artsiom Badun.
 */
@NoRepositoryBean
public interface BaseRepo<T, ID extends Serializable> extends PagingAndSortingRepository<T, ID> {
}
