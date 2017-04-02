package zfreeds.pineappleclone;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PostJob extends AppCompatActivity {

    private Toolbar mToolbar;

    TextView startTimeView, endTimeView, jobTypeView, streetView, cityView, provinceView, descriptionView;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_job);

        mToolbar = (Toolbar) findViewById(R.id.actionBar);
        mToolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(mToolbar);

        startTimeView=(TextView) findViewById(R.id.startTime);
        endTimeView=(TextView) findViewById(R.id.endTime);
        jobTypeView=(TextView) findViewById(R.id.jobType);
        streetView=(TextView) findViewById(R.id.street);
        cityView=(TextView) findViewById(R.id.city);
        provinceView=(TextView) findViewById(R.id.province);
        descriptionView=(TextView) findViewById(R.id.description);
        submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAllInput();
                //there are no other activities, just restart the current one
                Intent intent = getIntent();
                finish();
                startActivity(intent);

            }
        });

    }

    private void getAllInput(){
        RequestPosition request=new RequestPosition(
                startTimeView.getText().toString(),
                endTimeView.getText().toString(),
                jobTypeView.getText().toString(),
                streetView.getText().toString(),
                cityView.getText().toString(),
                provinceView.getText().toString(),
                descriptionView.getText().toString()
        );

        System.out.println(request.city);



        //do stuff with data such as send to server
    }


}
