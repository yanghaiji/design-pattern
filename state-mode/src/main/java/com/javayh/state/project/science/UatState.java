package com.javayh.state.project.science;

import com.javayh.constant.Constant;
import com.javayh.state.project.ProjectState;

/**
 * <p>
 * uat 环境
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-04-26
 */
public class UatState implements ProjectState {


    @Override
    public String run(String obj) {
        return Constant.UAT.equalsIgnoreCase(obj) ? getSpeedOfProgress()
                : null;
    }

    private String getSpeedOfProgress() {
        return "项目2.0版本为进入UAT阶段";
    }
}
