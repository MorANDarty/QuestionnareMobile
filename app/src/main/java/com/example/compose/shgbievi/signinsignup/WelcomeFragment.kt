package com.example.compose.shgbievi.signinsignup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.compose.shgbievi.Screen
import com.example.compose.shgbievi.navigate
import com.example.compose.shgbievi.theme.JetsurveyTheme

/**
 * Fragment containing the welcome UI.
 */
class WelcomeFragment : Fragment() {

    private val viewModel: WelcomeViewModel by viewModels { WelcomeViewModelFactory() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel.navigateTo.observe(viewLifecycleOwner) { navigateToEvent ->
            navigateToEvent.getContentIfNotHandled()?.let { navigateTo ->
                navigate(navigateTo, Screen.Welcome)
            }
        }

        return ComposeView(requireContext()).apply {
            setContent {
                JetsurveyTheme {
                    WelcomeScreen(
                        onEvent = { event ->
                            when (event) {
                                is WelcomeEvent.SignInSignUp -> viewModel.handleContinue(
                                    event.email
                                )
                                WelcomeEvent.SignInAsGuest -> viewModel.signInAsGuest()
                            }
                        }
                    )
                }
            }
        }
    }
}
