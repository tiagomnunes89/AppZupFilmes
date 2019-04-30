package br.com.zupfilms.ui.home.homeActivity;

import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import br.com.zupfilms.R;

public class HomeActivityViewHolder {

    BottomNavigationView bottomNavigationView;
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    TextView titleToolBar;

    HomeActivityViewHolder(View view) {
        drawerLayout = view.findViewById(R.id.drawer_layout);
        CoordinatorLayout homeDrawer = view.findViewById(R.id.home_drawer);
        bottomNavigationView = homeDrawer.findViewById(R.id.botton_nav_view);
        titleToolBar = homeDrawer.findViewById(R.id.textHomeTitle);
    }
}
