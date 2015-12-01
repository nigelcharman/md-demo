package skills;

import org.apache.commons.lang3.text.WordUtils;
import org.concordion.api.extension.Extensions;
import org.concordion.ext.MarkdownExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
@Extensions(MarkdownExtension.class)

//implements Spec01
public class SkillNaming {
    public String normalise(String skill) {
        return WordUtils.capitalize(skill);
    }
}
