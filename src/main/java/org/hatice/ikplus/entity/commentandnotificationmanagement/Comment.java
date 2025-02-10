package org.hatice.ikplus.entity.commentandnotificationmanagement;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_comment")
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long companyId;
	private Long userId;
	
	@Column(name = "comment", columnDefinition = "TEXT")
	private String comment;
	
	private Integer rating;
	private Timestamp createdAt;
	private Timestamp updatedAt;
}