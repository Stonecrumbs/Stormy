package ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by luisaanjos on 21/08/15.
 */
public class AlertDialogFragment extends DialogFragment{



    private String errTittle;
    private String errMessage;
    private String errContext;

    public String getErrTittle() {
        return errTittle;
    }

    public void setErrTittle(String errTittle) {
        this.errTittle = errTittle;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }

    public String getErrContext() {
        return errContext;
    }

    public void setErrContext(String errContext) {
        this.errContext = errContext;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                //  .setTitle(context.getString(R.string.tittle_error))
                //  .setMessage(context.getString(R.string.message_error))
                //  .setPositiveButton(context.getString(R.string.button_text_error), null);
                .setTitle(errTittle)
                .setMessage(errMessage)
                .setPositiveButton(errContext,null);
        AlertDialog dialog = builder.create();
        return dialog;
    }
}
