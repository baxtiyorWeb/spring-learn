package com.todo.app.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * todoApplication
 */

@RestController
@RequestMapping("/api")
public class todoApplication {

     @GetMapping("/todo")
     public String todo() {
          return "Todo";
     }

}
