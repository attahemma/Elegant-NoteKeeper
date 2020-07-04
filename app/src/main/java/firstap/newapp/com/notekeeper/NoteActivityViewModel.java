package firstap.newapp.com.notekeeper;

import android.os.Bundle;

import androidx.lifecycle.ViewModel;

/**
 * Created by GCONAM on 7/4/2020.
 */

public class NoteActivityViewModel extends ViewModel {
    public static final String ORIGINAL_NOTE_COURSE_ID = "firstap.newapp.com.notekeeper.ORIGINAL_NOTE_COURSE_ID";
    public static final String ORIGINAL_NOTE_TITLE = "firstap.newapp.com.notekeeper.ORIGINAL_NOTE_TITLE";
    public static final String ORIGINAL_NOTE_TEXT = "firstap.newapp.com.notekeeper.ORIGINAL_NOTE_TEXT";

    public String mOriginalNoteCourseId;
    public String mMOriginalNoteTitle;
    public String mMOriginalNoteText;
    public boolean mIsNewlyCreated = true;

    public void saveState(Bundle outstate) {
        outstate.putString(ORIGINAL_NOTE_COURSE_ID, mOriginalNoteCourseId);
        outstate.putString(ORIGINAL_NOTE_TITLE, mMOriginalNoteTitle);
        outstate.putString(ORIGINAL_NOTE_TEXT, mMOriginalNoteText);
    }

    public void restoreState(Bundle inState){
        mOriginalNoteCourseId = inState.getString(ORIGINAL_NOTE_COURSE_ID);
        mMOriginalNoteTitle = inState.getString(ORIGINAL_NOTE_TITLE);
        mMOriginalNoteText = inState.getString(ORIGINAL_NOTE_TEXT);
    }
}
