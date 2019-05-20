package designPattern.TemplateMethod;

/**
 * Created by Mouri on 2019/2/20 16:59
 */
public abstract class WakeUpTemplate {
        public final void wakeup() {
            leaveBed();
            if(IsTakeBath()){
                takeBath();
            }
            brushTooth();
            washFace();
            eatBrakefast();

        }

        protected void leaveBed() {
            System.out.println("leave the bed first!");
        }

        protected void takeBath(){
            System.out.println("foreigner always take bathes first");
        };

        protected boolean IsTakeBath(){
            return false;
        }

        protected void brushTooth(){
            System.out.println("brush our tooth");
        };

        protected void washFace() {
            System.out.println("wash your face!");
        }

        protected abstract void eatBrakefast();

}
