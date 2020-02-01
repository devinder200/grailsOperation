import com.mycompany.myapp.UserPasswordEncoderListener
import com.mycompany.myapp.CustomUserDetailsService
// Place your Spring DSL code here
beans = {
    userPasswordEncoderListener(UserPasswordEncoderListener)
    userDetailsService(CustomUserDetailsService)
}
