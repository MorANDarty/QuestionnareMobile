package com.example.compose.shgbievi.signinsignup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.compose.jetsurvey.R
import com.example.compose.shgbievi.Screen.*
import com.example.compose.shgbievi.navigate
import com.example.compose.shgbievi.theme.JetsurveyTheme

/**
 * Fragment containing the sign up UI
 */
class SignUpFragment : Fragment() {

    private val viewModel: SignUpViewModel by viewModels { SignUpViewModelFactory() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel.navigateTo.observe(viewLifecycleOwner) { navigateToEvent ->
            navigateToEvent.getContentIfNotHandled()?.let { navigateTo ->
                navigate(navigateTo, SignUp)
            }
        }

        return ComposeView(requireContext()).apply {
            id = R.id.sign_up_fragment

            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            setContent {
                JetsurveyTheme {
                    SignUp(
                        onNavigationEvent = { event ->
                            when (event) {
                                is SignUpEvent.SignUp -> {
                                    viewModel.signUp(event.email, event.password)
                                }
                                SignUpEvent.SignIn -> {
                                    viewModel.signIn()
                                }
                                SignUpEvent.SignInAsGuest -> {
                                    viewModel.signInAsGuest()
                                }
                                SignUpEvent.NavigateBack -> {
                                    activity?.onBackPressedDispatcher?.onBackPressed()
                                }
                            }
                        }
                    )
                }
            }
        }
    }
}
