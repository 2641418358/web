package com.pzhuweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Attendee {

    private String attendee_id;

    private String meet_id;

    private String user_id;

    private Integer flag;

}
