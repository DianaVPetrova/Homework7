package bg.softuni.diana.material_design_fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import bg.softuni.diana.material_design_fragment.databinding.ActivityMainBinding;
import bg.softuni.diana.material_design_fragment.feeds.FeedsFragment;
import bg.softuni.diana.material_design_fragment.feeds.StoriesFragment;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

       // binding.fab.setOnClickListener(view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
         //       .setAction("Action", null).show());

        setupToolbar();
        setupBottomNavigation();
    }

    private void setupToolbar() {
        setSupportActionBar(binding.toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.action_search) {
            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    private void setupBottomNavigation() {
        binding.bottomNav.setSelectedItemId(R.id.item_feed);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.feed);
        }

        Menu menu = binding.bottomNav.getMenu();
        selectFragment(menu.getItem(0));

        binding.bottomNav.setOnNavigationItemSelectedListener(item -> {
            if (getSupportActionBar() != null) {
                getSupportActionBar().setTitle(item.getTitle());
            }
            selectFragment(item);
            return false;
        });

    }

    protected void selectFragment(MenuItem item) {
        item.setChecked(true);
        binding.toolbar.setElevation(4);

        switch (item.getItemId()) {
            case R.id.item_feed:
                pushFragment(new FeedsFragment());
                binding.toolbar.setElevation(0);
                break;
            case R.id.item_gifts:
               pushFragment(new StoriesFragment());
                binding.toolbar.setElevation(0);
                break;
            case R.id.item_scanner:
            //    pushFragment(new Frag4());
                break;
            case R.id.item_profile:
            //    pushFragment(new Frag4());
                break;
        }
    }

    protected void pushFragment(Fragment fragment) {
        hideKeyboard();
        if (fragment == null)
            return;

        FragmentManager fragmentManager = getSupportFragmentManager();
        if (fragmentManager != null) {
            FragmentTransaction ft = fragmentManager.beginTransaction();
            if (ft != null) {
                ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                ft.replace(R.id.fragment_container, fragment);
                ft.commit();
            }
        }
    }

    public void hideKeyboard() {
        if (getCurrentFocus() != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
            }
        }
    }

}
