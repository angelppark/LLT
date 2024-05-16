package com.llt.v1.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="tb_user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx", nullable = false, unique = true, updatable = false)
    private Long Idx;

    @Column(name = "user_id", columnDefinition = "varchar(100)", updatable = false)
    @Comment("유저 아이디")
    private String userId;

    @Column(name = "username", columnDefinition = "varchar(100)", updatable = false)
    @Comment("유저 이름")
    private String userName;

    @Column(name = "email", columnDefinition = "varchar(100)", updatable = false)
    @Comment("유저 이메일")
    private String email;

    @Column(name = "password", columnDefinition = "varchar(100)", updatable = false)
    @Comment("비밀번호")
    private String password;

    @Column(name = "gender", length = 1, updatable = false)
    @Comment("성별 남자:1 여자:2")
    private int gender;

    @Column(name = "age", length = 2, updatable = false)
    @Comment("나이")
    private int age;

    @Column(name = "profile_image", columnDefinition = "varchar(100)", nullable = false)
    @Comment("프로필 이미지")
    private String profileImage;

    @Column(name = "introduction", columnDefinition = "text", nullable = false)
    @Comment("자기소개 글")
    private String introduction;

    @Column(name = "preference1", columnDefinition = "varchar(100)", nullable = false)
    @Comment("상대방 선호 조건1")
    private String preference1;

    @Column(name = "preference2", columnDefinition = "varchar(100)", nullable = false)
    @Comment("상대방 선호 조건2")
    private String preference2;

    @Column(name = "created_at", columnDefinition = "datetime", nullable = false)
    @Comment("가입일자")
    private String created_at;

    @Column(name = "updated_at", columnDefinition = "datetime", nullable = false)
    @Comment("최근 정보 수정일자")
    private String updated_at;

}
