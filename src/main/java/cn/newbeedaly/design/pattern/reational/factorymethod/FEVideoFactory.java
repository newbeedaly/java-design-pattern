package cn.newbeedaly.design.pattern.reational.factorymethod;

/**
 * @author newbeedaly
 * @date 2023-07-23
 */
public class FEVideoFactory extends VideoFactory{

    @Override
    public Video getVideo() {
        return new FEVideo();
    }

}
