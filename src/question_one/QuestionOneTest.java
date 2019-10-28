package question_one;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.assertEquals;


public class QuestionOneTest  {

    @Test
    public void anagramTest() {

        // assert statements
        assertEquals("Two strings are Anagram", true, QuestionOne.areAnagram("bleat","table"));
       // assertEquals("Two strings are Anagram", true, question_one.QuestionOne.areAnagram("BLEAT","table"));
        assertEquals("Two strings are not Anagram", true, QuestionOne.areAnagram("eat","tar"));
   //     assertEquals("Two strings are not Anagram", true, question_one.QuestionOne.areAnagram("EAT","tar"));

    }

    public static void main(String[] args)
    {

        Result result = JUnitCore.runClasses(QuestionOneTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}
