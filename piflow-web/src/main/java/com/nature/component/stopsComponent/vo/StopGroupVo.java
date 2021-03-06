package com.nature.component.stopsComponent.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Group name table
 *
 * @author Nature
 */
@Getter
@Setter
public class StopGroupVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String groupName; // Group name

    private List<StopsTemplateVo> stopsTemplateVoList = new ArrayList<>();

}

