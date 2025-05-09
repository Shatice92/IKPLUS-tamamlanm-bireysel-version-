package org.hatice.ikplus.repository.commentandnotificationrepository;

import org.hatice.ikplus.entity.commentandnotificationmanagement.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
	Optional<Comment> findByCompanyIdAndCompanyManagerId(Long companyId, Long userId);
}