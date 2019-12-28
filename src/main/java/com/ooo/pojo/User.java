package com.ooo.pojo;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class User {
    private String name;
    private int age;
    private User friend;// 对象类型属性

}