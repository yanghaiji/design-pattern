package com.javayh.state.project.science;

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
public class NullState implements ProjectState {

    @Override
    public String run(String obj) {
        return "非法操作";
    }
}
