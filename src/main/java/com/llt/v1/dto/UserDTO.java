package com.llt.v1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.llt.v1.entity.UserEntity;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@Data
public class UserDTO {
    private Long idx;
    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("user_name")
    private String userName;
    private String email;
    private String password;
    private int gender;
    private int age;
    @JsonProperty("profile_image")
    private String profileImage;
    private String introduction;
    private String preference1;
    private String preference2;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;

    public UserDTO(UserEntity entity){
        this.idx = entity.getIdx();
        this.userId = entity.getUserId();
        this.userName = entity.getUserName();
        this.email = entity.getEmail();
        this.password = entity.getPassword();
        this.gender = entity.getGender();
        this.age = entity.getAge();
        this.profileImage = entity.getProfileImage();
        this.introduction = entity.getIntroduction();
        this.preference1 = entity.getPreference1();
        this.preference2 = entity.getPreference2();
        this.createdAt = entity.getCreatedAt();
        this.updatedAt = entity.getUpdatedAt();
    }

    public static UserEntity toEntitiy(final UserDTO dto) {
        return UserEntity.builder()
                .idx(dto.getIdx())
                .userId(dto.getUserId())
                .userName(dto.getUserName())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .gender(dto.getGender())
                .age(dto.getAge())
                .profileImage(dto.getProfileImage())
                .introduction(dto.getIntroduction())
                .preference1(dto.getPreference1())
                .preference2(dto.getPreference2())
                .createdAt(dto.getCreatedAt())
                .updatedAt(dto.getUpdatedAt())
                .build();
    }
}
