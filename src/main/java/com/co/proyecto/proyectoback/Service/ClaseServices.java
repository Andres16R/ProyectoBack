package com.co.proyecto.proyectoback.Service;

import com.co.proyecto.proyectoback.Model.ClaseModel;
import com.co.proyecto.proyectoback.Repository.ClaseRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class ClaseServices implements ClaseRepository {
    @Autowired
    private ClaseRepository ClaseRepository;


    public List<ClaseModel> findAll() {
        return ClaseRepository.findAll();
    }


    public List<ClaseModel> findAll(Sort sort) {
        return null;
    }


    public Page<ClaseModel> findAll(Pageable pageable) {
        return null;
    }


    public List<ClaseModel> findAllById(Iterable<Long> longs) {
        return null;
    }


    public long count() {
        return 0;
    }


    public void deleteById(Long aLong) {

    }


    public void delete(ClaseModel entity) {

    }


    public void deleteAllById(Iterable<? extends Long> longs) {

    }


    public void deleteAll(Iterable<? extends ClaseModel> entities) {

    }


    public void deleteAll() {

    }


    public <S extends ClaseModel> S save(S entity) {
        return ClaseRepository.save(entity);
    }


    public <S extends ClaseModel> List<S> saveAll(Iterable<S> entities) {
        return null;
    }


    public Optional<ClaseModel> findById(Long aLong) {
        return Optional.empty();
    }


    public boolean existsById(Long aLong) {
        return false;
    }


    public void flush() {

    }


    public <S extends ClaseModel> S saveAndFlush(S entity) {
        return null;
    }


    public <S extends ClaseModel> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }


    public void deleteAllInBatch(Iterable<ClaseModel> entities) {

    }


    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }


    public void deleteAllInBatch() {

    }


    public ClaseModel getOne(Long aLong) {
        return null;
    }

    public ClaseModel getById(Long aLong) {
        return null;
    }


    public ClaseModel getReferenceById(Long aLong) {
        return null;
    }


    public <S extends ClaseModel> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }


    public <S extends ClaseModel> List<S> findAll(Example<S> example) {
        return null;
    }


    public <S extends ClaseModel> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }


    public <S extends ClaseModel> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }


    public <S extends ClaseModel> long count(Example<S> example) {
        return 0;
    }


    public <S extends ClaseModel> boolean exists(Example<S> example) {
        return false;
    }


    public <S extends ClaseModel, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
