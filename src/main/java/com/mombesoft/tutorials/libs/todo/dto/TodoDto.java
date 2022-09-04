package com.mombesoft.tutorials.libs.todo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoDto {
  private String id;
  private String title;
  private boolean status;
  private String createdAt;
  private String updateedAt;
}
