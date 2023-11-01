<?php

namespace App\Http\Controllers;

use App\Models\User;
use App\Models\UserModel;
use Illuminate\Http\Request;

class UserController extends Controller
{
    public function home() {
        $data = [
            'title' => 'BRP'
        ];
    
        return view('home', $data);
    }


    public function registrationStudent() {
        $data = [
            'title' => 'Registo estudante'
        ];
        return view('registo-estudante', $data);
    }

    public function registrationInstitution() {
        $data = [
            'title' => 'Registo instituição'
        ];

        return view('registo-instituicao', $data);
    }

    //Login
    public function login() {
        $data = [
            'title' => 'Login'
        ];

        return view('login', $data);
    }

    public function login_submit(Request $request) {

/*          //fake login
        session()->put('email', 'student');
 */
        //Form validation
        $request -> validate([
            'email' => 'required|email',
            'password' => 'required',
        ], [
            'email.required' => 'O campo é de preenchimento obrigatório',
            'email.email' => 'Indique um email válido',
            'password.required' => 'O campo é de preenchimento obrigatório'
        ]);

        // get form data
        $email = $request->input('email');
        $password = $request->input('password');

        // check if user exists in DB
        $model = new UserModel();
        $user = $model->where('email', '=', $email)
                      ->whereNull('deleted_at') // ignorar utilizadores que foram eliminados
                      ->first();

        // check is user exists
        if ($user) {
            //if user exists check if password is correct
            if (password_verify($password, $user->password)) {
                $session_data = [
                    'id' => $user->id,
                    'email' => $user->email,
                    'primeiroNome' => $user->primeiroNome
                ];
                session()->put($session_data);
                return redirect()->route('home');
            }
        }

        // invalid login
        return redirect()
            ->route('login') // direccionar para a rota login
            ->withInput() // manter os dados preenchidos
            ->with('login_error', 'Login inválido'); // retornar mensagem
    }


    // logout
    public function logout() {
        session()->forget('email');
        return redirect()->route('home');
    }


    //Recover password
    public function recuperarPassword() {
        $data = [
            'title' => 'Recuperar palavra-passe'
        ];

        return view('recuperar-password', $data);
    }

    public function recuperarPassword_submit(Request $request) {
        // Form validation
        $request->validate([
            'email' => 'required|email',
        ], [
            'email.required' => 'O campo é de preenchimento obrigatório',
            'email.email' => 'Indique um email válido',
        ]);


         // Get the email from the request
         $email = $request->input('email');
    
         // Check if the email exists in the database
        $model = new UserModel();
        $user = $model->where('email', '=', $email)
                        ->whereNull('deleted_at') // ignorar utilizadores que foram eliminados
                        ->first();

/*      $user = UserModel::where('email', $email)->whereNull('deleted_at')->first(); */
     
        // If the email exists:
         if ($user) {
            // Send a password recovery email or generate a reset token, etc.
            // Return a success message or redirect to a success page(?)
         }

         return redirect()
            ->route('recuperar-password')
            ->withInput() // manter os dados preenchidos
            ->with('password_feedback', 'Caso o seu email se encontre registado, receberá em breve um email com instruções para redefinir a sua palavra-passe.'); // retornar mensagem
    
    }


    // About us
    public function sobreNos() {
        $data = [
            'title' => 'Sobre nós'
        ];

        return view('sobre-nos', $data);
    }

    public function contactos() {
        $data = [
            'title' => 'Contactos'
        ];

        return view('contactos', $data);
    }

    public function vocacionaltestIntro() {
        $data = [
            'title' => 'Teste Vocacional - Introdução'
        ];

        return view('teste-vocacional-intro', $data);
    }


    public function testeVocacionalResultados() {
        $data = [
            'title' => 'Teste Vocacional - Resultados'
        ];

        return view('teste-vocacional-resultados', $data);
    }

    public function resultadosInstituicao() {
        $data = [
            'title' => 'Teste Vocacional - Resultados'
        ];

        return view('resultados-estatisticos', $data);
    }






    // 
    public function page2() {
        $myVar = 'Sou uma string enviada para a blade';

        $contactInfo = [
            'name' => 'Nome da pessoa',
            'phone' => 'Contacto da pessoa'
        ];

        // Obtem os contactos
        $contacts = $this->getContacts();

        // retornar a view com os dados
        return view('page2', compact('myVar', 'contactInfo', 'contacts'));
    }


    // Protected function with contacts
    protected function getContacts() {
        $contacts = [
            ['id' => 1, 'name' => 'Diana', 'phone' => '91111111'],
            ['id' => 2, 'name' => 'Patrícia', 'phone' => '92222222'],
        ];

        return $contacts;
    }


    // EXERCICIO 4
    public function ex() {
        $cesaeInfo = $this->getCesaeInfo();

        return view('exercicios.ex', compact('cesaeInfo'));
    }

    protected function getCesaeInfo() {
        $cesaeInfo = [
            ['name' => 'Cesae', 'address' => 'Rua Ciríaco Cardoso 186', 'email' => 'cesae@cesae.pt'],
            ['name' => 'Cinel', 'address' => 'Rua Vila Verde', 'email' => 'cinel@cinel.pt']
        ];

        return $cesaeInfo;
    }


}

