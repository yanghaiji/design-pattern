package com.javayh.state.project.science;

import com.javayh.constant.Constant;
import com.javayh.state.project.ProjectState;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-04-26
 */
public class DevState implements ProjectState {

    @Override
    public String run(String obj) {
        return Constant.DEV.equalsIgnoreCase(obj) ? getSpeedOfProgress()
                : null;
    }

    private String getSpeedOfProgress() {
        return "项目2.0版本开发完成50%;正在进行30%;未开发20%!";
    }
}
