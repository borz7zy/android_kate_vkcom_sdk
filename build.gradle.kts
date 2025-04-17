plugins {
	alias(libs.plugins.android.library)
}

android {
	namespace = "ru.borz7zy.sdkvk"
	compileSdk = 35

	defaultConfig {
		minSdk = 19

		consumerProguardFiles("consumer-rules.pro")
	}

	buildTypes {
		release {
			isMinifyEnabled = false
			proguardFiles(
				getDefaultProguardFile("proguard-android-optimize.txt"),
				"proguard-rules.pro"
			)
		}
	}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_21
		targetCompatibility = JavaVersion.VERSION_21
	}
}

dependencies {

	implementation(libs.appcompat)
	implementation(libs.material)
	androidTestImplementation(libs.ext.junit)
	androidTestImplementation(libs.espresso.core)
}

