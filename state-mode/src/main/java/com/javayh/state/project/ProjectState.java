package com.javayh.state.project;

/**
 * <p>
 *      项目状态
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-04-26
 */
@FunctionalInterface
public interface ProjectState {

    /**
     * <p>
     *       进行的操作
     * </p>
     * @version 1.0.0
     * @author Dylan-haiji
     * @since 2020/4/26
     * @param obj
     * @return void
     */
    String run(String obj);

    /**
     * <p>
     *       判断项目是否存在
     * </p>
     * @version 1.0.0
     * @author Dylan-haiji
     * @since 2020/4/26
     * @param projectName
     * @return java.lang.Boolean
     */
    static Boolean stateType(String projectName){
        return "Java有货".equalsIgnoreCase(projectName);
    }
}
