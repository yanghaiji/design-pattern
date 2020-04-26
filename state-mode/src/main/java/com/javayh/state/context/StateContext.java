package com.javayh.state.context;

import com.javayh.constant.Constant;
import com.javayh.state.project.ProjectState;
import com.javayh.state.project.science.DevState;
import com.javayh.state.project.science.NullState;
import com.javayh.state.project.science.RunState;
import com.javayh.state.project.science.TestState;
import com.javayh.state.project.science.UatState;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-04-26
 */
public class StateContext {

    private ProjectState projectState;

    public void setState(ProjectState state) {
        this.projectState = state;
    }
    /**
     * 用户感兴趣的接口方法
     */
    public void request(String obj) {
        if(Constant.DEV.equalsIgnoreCase(obj)){
            projectState = new DevState();
        }else if(Constant.TEST.equalsIgnoreCase(obj)){
            projectState = new TestState();
        }else if(Constant.UAT.equalsIgnoreCase(obj)){
            projectState = new UatState();
        }else if(Constant.RUN.equalsIgnoreCase(obj)){
            projectState = new RunState();
        }else {
            projectState = new NullState();
        }
        //转调state来处理
        String run = projectState.run(obj);
        System.out.println(run);
    }
}
