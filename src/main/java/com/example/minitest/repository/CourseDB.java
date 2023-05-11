package com.example.minitest.repository;

import com.example.minitest.dto.CartItemDto;
import com.example.minitest.entity.CartItem;
import com.example.minitest.entity.Course;
import com.example.minitest.mapper.CartItemMapper;

import java.util.ArrayList;
import java.util.List;

import static com.example.minitest.entity.Course.*;

public class CourseDB {
    public static List<Course> courses = new ArrayList<>(List.of(
        builder().withId(1).withName("Java Spring Boot").withPrice(300).build(),
        builder().withId(2).withName("Javascript").withPrice(400).build(),
        builder().withId(3).withName("ReactJS").withPrice(500).build()
    ));

    public static List<CartItem> cartItems = new ArrayList<>(List.of(
            CartItem.builder().withId(1).withCourseId(1).withCount(1).build(),
            CartItem.builder().withId(2).withCourseId(2).withCount(1).build(),
            CartItem.builder().withId(3).withCourseId(3).withCount(1).build()
    ));




}
