package com.example.ec.repo;

import com.example.ec.domain.Tour;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Mohammed Amr
 * @created 01/06/2021 - 16:25
 * @project explorecali
 */
public interface TourRepository extends CrudRepository<Tour, Integer> {
}
