package com.llt.v1.dto;

import com.llt.v1.entity.UserEntity;
import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {
    private Long userId;
    private String userName;
    private String email;
    private String password;
    private int gender;
    private int age;
    private String profileImage;
    private String introduction;
    private String preference1;
    private String preference2;
    private String created_at;
    private String updated_at;

    public UserDTO(UserEntity entity){
//        this.idx = entity.getIdx();
        this.userName = entity.getUserName();
        this.email = entity.getEmail();
        this.password = entity.getPassword();
        this.gender = entity.getGender();
        this.age = entity.getAge();
        this.profileImage = entity.getProfileImage();
        this.introduction = entity.getIntroduction();
        this.preference1 = entity.getPreference1();
        this.preference2 = entity.getPreference2();
        this.created_at = entity.getCreated_at();
        this.updated_at = entity.getUpdated_at();
    }

    public static UserEntity toEntitiy(final UserDTO dto) {
        return UserEntity.builder()
//                .userId(dto.getUserId())
                .userName(dto.getUserName())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .gender(dto.getGender())
                .age(dto.getAge())
                .profileImage(dto.getProfileImage())
                .introduction(dto.getIntroduction())
                .preference1(dto.getPreference1())
                .preference2(dto.getPreference2())
                .created_at(dto.getCreated_at())
                .updated_at(dto.getUpdated_at())
                .build();
    }
}
