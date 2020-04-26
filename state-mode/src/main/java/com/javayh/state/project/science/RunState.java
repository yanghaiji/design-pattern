package com.javayh.state.project.science;

import com.javayh.constant.Constant;
import com.javayh.state.project.ProjectState;

/**
 * <p>
 * 线上运行
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-04-26
 */
public class RunState implements ProjectState {


    @Override
    public String run(String obj) {
        return Constant.RUN.equalsIgnoreCase(obj) ? getSpeedOfProgress()
                : null;
    }

    private String getSpeedOfProgress() {
        return "项目2.0版本正在开发,敬请期待";
    }
}
