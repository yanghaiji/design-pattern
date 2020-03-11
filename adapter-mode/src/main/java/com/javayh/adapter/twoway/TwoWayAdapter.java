package com.javayh.adapter.twoway;

import com.javayh.adapter.clazz.ComputerInit;

/**
 * <p>
 *      双向适配接口
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-03-11 11:10
 */
public class TwoWayAdapter implements ComputerInit ,TwoWayAdaptee{

    private TwoWayAdaptee twoWayAdaptee;
    private ComputerInit computerInit;

    public TwoWayAdapter(TwoWayAdaptee twoWayAdaptee) {
        this.twoWayAdaptee = twoWayAdaptee;
    }

    public TwoWayAdapter(ComputerInit computerInit) {
        this.computerInit = computerInit;
    }


    @Override
    public String assemble() {
        return twoWayAdaptee.twoWayAdaptee();
    }

    @Override
    public String twoWayAdaptee() {
        return computerInit.assemble();

    }
}
