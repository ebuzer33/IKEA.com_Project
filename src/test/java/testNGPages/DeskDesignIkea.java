package testNGPages;

import org.testng.Assert;
import webElements.DeskDesignElements;
import org.testng.annotations.Test;
import utils.BaseDriver;
import utils.Parent;

public class DeskDesignIkea extends BaseDriver{

    DeskDesignElements dp = new DeskDesignElements();

    @Test
    public void deskDesignPlanners(){

       getDriver().get("https://www.ikea.com/us/en/planners/");

        dp.clickFunction(dp.getCookies1());
        dp.clickFunction(dp.getDesignDeskBtn());

        getDriver().switchTo().frame(dp.getIframe());

        Parent.waiting(2);
       dp.clickFunction(dp.getDimensions());
       int dimensionsListSize= dp.getDimensionsList().size();

        dp.clickFunction(dp.getLegsAndTrestles());
        int legsListSize= dp.getLegsList().size();

        for (int i = 0; i < dimensionsListSize; i++) {

            dp.clickFunction(dp.getDimensions());
            dp.clickFunction(dp.getDimensionsList().get(i));

            for (int j = 0; j < legsListSize; j++) {
                dp.clickFunction(dp.getLegsAndTrestles());
                Parent.waiting(1);
                dp.clickFunction(dp.getLegsList().get(j));
                dp.clickFunction(dp.getLegsAndTrestles());

                int topListSize = dp.getTopList().size();

                if (topListSize > 3) {
                    topListSize /= 3;
                }

                for (int x = 0; x < topListSize; x++) {
                    dp.clickFunction(dp.getTopRightScrollBtn());
                    Parent.waiting(1);
                }

                int bottomListSize = dp.getBottomList().size();

                if (bottomListSize > 3) {
                    bottomListSize /= 3;
                }

                for (int l = 0; l < bottomListSize; l++) {
                    dp.clickFunction(dp.getBottomRightScrollBtn());
                    Parent.waiting(1);
                    if (bottomListSize <= 3) {
                        dp.clickFunction(dp.getBottomLeftScrollBtn());
                    }
                }

            }
        }

        String title= getDriver().getTitle();
        Assert.assertTrue(title.contains("Build your own Desk Planner"));
    }
}
