package cn.cnic.third.vo.stop;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class ThirdStopsComponentVo implements Serializable {
    private String name;
    private String bundle;
    private String owner;
    private String inports;
    private String outports;
    private String groups;
    private boolean isCustomized;
    private String description;
    private String icon;
    List<ThirdStopsComponentPropertyVo> properties;

}