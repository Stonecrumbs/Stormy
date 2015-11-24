package weather;

import com.teamtreehouse.stormy.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import ui.MainActivity;

/**
 * Created by luisaanjos on 22/08/15.
 */
public class Current {

    private static final String TAG = MainActivity.class.getSimpleName();

    private String mIcon;
    private Long mTime;
    private Double mTemperature;
    private Double mHumidity;
    private Double mPrecipChance;
    private String mSummary;

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    private String mTimeZone;

    public String getIcon() {
        return mIcon;
    }

    public int getIconId(){
        return Forecast.getIconId(mIcon);
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public Long getTime() {
        return mTime;
    }

    public void setTime(Long time) {
        mTime = time;
    }

    public String getFormattedTime(){
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        Date dateTime = new Date(getTime()*1000);
        String timeString = formatter.format(dateTime);

        return timeString;
    }

    public int getTemperature() {
        int tempF = (int) Math.round(mTemperature);
        int tempC = (int) ((5.0 / 9) * (Math.round(mTemperature) - 32));
        return tempC;
    }

    public void setTemperature(Double temperature) {
        mTemperature = temperature;
    }

    public int getHumidity() {
        int humidity = (int) Math.round(mHumidity*100);
        return humidity;
    }

    public void setHumidity(Double humidity) {
        mHumidity = humidity;
    }

    public int getPrecipChance() {
        int precip = (int) Math.round(mPrecipChance);
        return precip;
    }

    public void setPrecipChance(Double precipChance) {
        mPrecipChance = precipChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }
}
