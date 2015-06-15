# NavigationView
![capture](https://github.com/nshmura/DesignSupportLibraryDemo/raw/master/NavigationView-Demo/docs/capture.gif)

## Code Summry

### layout/activity_main.xml
``` 
    <android.support.design.widget.NavigationView
            android:id="@+id/navigation_view"
            android:layout_width="wrap_content"
            android:layout_height="match_parent"
            android:layout_gravity="start"
            app:headerLayout="@layout/drawer_header"
            app:menu="@menu/drawer"/>
```

### layout/drawer_header.xml
```
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="100dp">

        <ImageView
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:scaleType="centerCrop"
                android:src="@drawable/cover"/>

        <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="bottom"
                android:text="@string/app_name"/>
</FrameLayout>
```

### menu/drawer.xml
```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <group android:checkableBehavior="single">
        <item
                android:id="@+id/drawer_item_home"
                android:checked="true"
                android:icon="@drawable/ic_launcher"
                android:title="@string/menu_home"/>
        <item
                android:id="@+id/drawer_item_mypage"
                android:icon="@drawable/ic_launcher"
                android:title="@string/menu_mypage"/>
        <item
                android:id="@+id/drawer_item_wishlist"
                android:icon="@drawable/ic_launcher"
                android:title="@string/menu_wishlist"/>
        <item
                android:id="@+id/drawer_item_user"
                android:icon="@drawable/ic_launcher"
                android:title="@string/menu_user"/>
        <item
                android:id="@+id/drawer_item_account"
                android:icon="@drawable/ic_launcher"
                android:title="@string/menu_account"/>
    </group>
</menu>
```
