import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class plagin extends AnAction{

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        BrowserUtil.browse("https://docs.google.com/spreadsheets/u/0/d/1jc9GBNwBLTAz7sv5hk53CL9PumSKew4u0O5RUtlQ21A/htmlview#");
    }
}
