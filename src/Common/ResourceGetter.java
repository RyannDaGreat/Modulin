package Common;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
public class ResourceGetter
{
    private static String getResource(String localPathToRyanAppFramework)
    {
        return ResourceGetter.class.getResource(localPathToRyanAppFramework).toString();//.toExternalForm() ≣ .toString() SOURCE: https://teamtreehouse.com/community/resources-and-toexternalform
        //NOTE: stylesheetPath looks something like "file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Experiments_/appstyle.css" **Notice that its in the /out/ folder AND that it has "file:" at the beginning**
    }
    private static final ResourceBundle RESOURCE_BUNDLE=ResourceBundle.getBundle("Common.Settings");
    public static void main(String[]isATest)
    {
        System.out.println(getProperty("prop0"));
    }
    public static String getProperty(String key)
    {
        try
        {
            return RESOURCE_BUNDLE.getString(key);
        }
        catch(MissingResourceException e)
        {
            return '!'+key+'!';
        }
    }
}
