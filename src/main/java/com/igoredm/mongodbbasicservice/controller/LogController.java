package com.igoredm.mongodbbasicservice.controller;

import com.igoredm.mongodbbasicservice.model.entity.LogEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController extends BaseController<LogEntity> {
}
