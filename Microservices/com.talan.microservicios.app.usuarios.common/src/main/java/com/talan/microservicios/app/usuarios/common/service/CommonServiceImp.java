package com.talan.microservicios.app.usuarios.common.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;




public class CommonServiceImp<E,R extends PagingAndSortingRepository<E,Long>> implements ICommonService<E>{
    @Autowired
    protected R repository;
    @Override
    @Transactional(readOnly = true)
    public Iterable<E> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public Optional<E> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public E save(E entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
            repository.deleteById(id);
    }

	@Override
	@Transactional(readOnly=true)
	public Page<E> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}
}
