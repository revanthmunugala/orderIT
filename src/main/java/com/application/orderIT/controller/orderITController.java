package com.application.orderIT.controller;

import com.application.orderIT.entity.menuRecord;
import com.application.orderIT.entity.restaurantRecord;
import com.application.orderIT.entity.userRecord;
import com.application.orderIT.service.restaurantRecordService;
import com.application.orderIT.service.menuRecordService;
import com.application.orderIT.service.userRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/orderIT")
public class orderITController {

    private final restaurantRecordService restaurantRecordService;
    private final menuRecordService menuRecordService;
    private final userRecordService userRecordService;

    public orderITController(restaurantRecordService restaurantRecordService, com.application.orderIT.service.menuRecordService menuRecordService, userRecordService userService) {
        this.restaurantRecordService = restaurantRecordService;
        this.menuRecordService = menuRecordService;
        this.userRecordService = userService;
    }

    // Controller for menuRecord

    @GetMapping("getAllMenu")
    public List<menuRecord> getAllMenu()
    {
        return menuRecordService.getAllmenu();
    }

    @PostMapping("addMenu")
    public boolean addMenu(@RequestBody menuRecord menuRecord)
    {
        return menuRecordService.addMenu(menuRecord);
    }


    // Controller for restaurantRecord

    @GetMapping("getAllRestaurants")
    public List<restaurantRecord> getAllRestaurants()
    {
        return restaurantRecordService.getAllRestaurants();
    }

    @PostMapping("addRestaurant")
    public boolean addRestaurant(@RequestBody restaurantRecord restaurantRecord)
    {
        return restaurantRecordService.addRestaurant(restaurantRecord);
    }

    // Controller for userRecord
    @GetMapping("getAllUsers")
    public List<userRecord> getAllUsers() {
        return userRecordService.getAllUsers();
    }

    @PostMapping("addUser")
    public boolean addUser(@RequestBody userRecord userRecord)
    {
        return userRecordService.addUser(userRecord);
    }

}
