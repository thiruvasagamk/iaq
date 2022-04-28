package com.fourcorners.aiq.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fourcorners.aiq.model.IqaParameters;

@Repository
public interface IaqParamsRepository extends JpaRepository<IqaParameters, Long> {

	/*
	 * @Query("select a from tbl_messages a where a.Date = :d") public
	 * List<IqaParameters> findByCreatedAtBetween(@Param("d") Date startDate);
	 */
}