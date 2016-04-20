package cn.martin.boot.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by lcssos on 16/4/21.
 */
@Getter
@Setter
public class Login implements Serializable {
    private Long uuid;
    private String name;
}
