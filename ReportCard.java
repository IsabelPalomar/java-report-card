
import java.util.Date;

public class ReportCard {

    private int mCardId;
    private Date mdateOfCreation;
    private String mMathSkills;
    private String martAndLanguage;
    private String mScience;
    private String mSocialStudies;
    private String mTeachercomments;
    private boolean mReviewedByParent;
    private static final String GRADE_EXCELENT="A";
    private static final String GRADE_GOOD="B";
    private static final String GRADE_SATISFACTORY="C";
    private static final String GRADE_NEEDS_IMPROVEMENT="D";
    private static final String MSG_EXCELENT="Excelent";
    private static final String MSG_GOOD="Good";
    private static final String MSG_SATISFACTORY ="Satisfactory";
    private static final String MSG_NEEDS_IMPROVEMENT ="Needs Improvement";

    public ReportCard(int mCardId, Date mdateOfCreation, String mMathSkills, String martAndLanguage, String mScience, String mSocialStudies) {
        this.mCardId = mCardId;
        this.mdateOfCreation = mdateOfCreation;
        this.mMathSkills = mMathSkills;
        this.martAndLanguage = martAndLanguage;
        this.mScience = mScience;
        this.mSocialStudies = mSocialStudies;
    }

    public ReportCard(int mCardId, Date mdateOfCreation, String mMathSkills, String martAndLanguage, String mScience, String mSocialStudies, boolean mReviewedByParent) {
        this.mCardId = mCardId;
        this.mdateOfCreation = mdateOfCreation;
        this.mMathSkills = mMathSkills;
        this.martAndLanguage = martAndLanguage;
        this.mScience = mScience;
        this.mSocialStudies = mSocialStudies;
        this.mReviewedByParent = mReviewedByParent;
    }

    public int getmCardId() {
        return mCardId;
    }

    public void setmCardId(int mCardId) {
        this.mCardId = mCardId;
    }

    public Date getMdateOfCreation() {
        return mdateOfCreation;
    }

    public void setMdateOfCreation(Date mdateOfCreation) {
        this.mdateOfCreation = mdateOfCreation;
    }

    public String getmMathSkills() {
        return mMathSkills;
    }

    public void setmMathSkills(String mMathSkills) {
        this.mMathSkills = mMathSkills;
    }

    public String getMartAndLanguage() {
        return martAndLanguage;
    }

    public void setMartAndLanguage(String martAndLanguage) {
        this.martAndLanguage = martAndLanguage;
    }

    public String getmScience() {
        return mScience;
    }

    public void setmScience(String mScience) {
        this.mScience = mScience;
    }

    public String getmSocialStudies() {
        return mSocialStudies;
    }

    public void setmSocialStudies(String mSocialStudies) {
        this.mSocialStudies = mSocialStudies;
    }

    public boolean ismReviewedByParent() {
        return mReviewedByParent;
    }

    public void setmReviewedByParent(boolean mReviewedByParent) {
        this.mReviewedByParent = mReviewedByParent;
    }

    public String getmTeachercomments() {
        return mTeachercomments;
    }

    public void setmTeachercomments(String mTeachercomments) {
        this.mTeachercomments = mTeachercomments;
    }

    public String getMessageText(String grade) {
        String messageText = "";
        switch (grade) {
            case GRADE_EXCELENT:
                messageText = MSG_EXCELENT;
                break;
            case GRADE_GOOD:
                messageText = MSG_GOOD;

                break;
            case GRADE_NEEDS_IMPROVEMENT:
                messageText = MSG_SATISFACTORY;

                break;
            case GRADE_SATISFACTORY:
                messageText = MSG_NEEDS_IMPROVEMENT;
                break;
        }
        return  messageText;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mCardId=" + mCardId +
                ", mdateOfCreation=" + mdateOfCreation +
                ", mMathSkills='" + mMathSkills + '\'' +
                ", martAndLanguage='" + martAndLanguage + '\'' +
                ", mScience='" + mScience + '\'' +
                ", mSocialStudies='" + mSocialStudies + '\'' +
                ", mTeachercomments='" + mTeachercomments + '\'' +
                ", mReviewedByParent=" + mReviewedByParent +
                '}';
    }

}
