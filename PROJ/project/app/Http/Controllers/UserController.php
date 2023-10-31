<?php

namespace App\Http\Controllers;

use App\Models\User;
use App\Models\UserModel;
use Illuminate\Http\Request;

class UserController extends Controller
{
    private $required = 'O campo é de preenchimento obrigatório';
    private $validEmail = 'Indique um email válido';
    private $uniqueEmail = 'O email inserido já se encontra registado';
    private $passwordMin = 'A password tem de ser no mínimo 8 caracteres';
    private $passwordMatch = 'As passwords inseridas não correspondem';
    private $termsAndConditions = 'Tem de aceitar os termos e condições';

    public function home() {
        $data = [
            'title' => 'BRP'
        ];
    
        return view('home', $data);
    }

    public function registoEstudante() {
        $data = [
            'title' => 'Registo estudante'
        ];
        return view('registo-estudante', $data);
    }

    public function registoEstudante_submit(Request $request) {
        //Form validation
        $request -> validate([
            'primeiro_nome' => 'required|max:50',
            'ultimo_nome' => 'required|max:50',
            'genero' => 'required',
            'distrito' => 'required|max:50',
            'concelho' => 'required|max:50',
            'freguesia' => 'required|max:50',
            'email' => 'required|email|max:50|unique:users',
            'password' => 'required|min:8|max:50',
            'confirmar_password' => 'required|same:password',
            'aceitar_termos' => 'required',
        ], [
            'primeiro_nome.required' => $this->required,
            'ultimo_nome.required' => $this->required,
            'genero.required' => $this->required,
            'distrito.required' => $this->required,
            'concelho.required' => $this->required,
            'freguesia.required' => $this->required,
            'email.required' => $this->required,
            'email.email' => $this->validEmail,
            'email.unique' => $this->uniqueEmail,
            'password.required' => $this->required,
            'password.min' => $this->passwordMin,
            'confirmar_password.required' => $this->required,
            'confirmar_password.same' => $this->passwordMatch,
            'aceitar_termos' => $this->termsAndConditions,
        ]);

        // ver a form data com o dd
        /* dd($request->all()); */

        // get form data
        $user = new UserModel();
        $user->primeiro_Nome = $request->primeiro_nome;
        $user->ultimo_Nome = $request->ultimo_nome;
        $user->genero = $request->genero;
        $user->distrito = $request->distrito;
        $user->concelho = $request->concelho;
        $user->freguesia = $request->freguesia;
        $user->email = $request->email;
        $user->password = password_hash($request->password, PASSWORD_DEFAULT); // password vai encriptada
        $user->save();

        return redirect()
            ->route('login') // redirect to login route after sucess registration
            ->withInput(); // keep the data fill */
    }

    // Institition registration
    public function registoInstituicao() {
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
            'email.required' => $this->required,
            'email.email' => $this->validEmail,
            'password.required' => $this->required
        ]);

        // get form data
        $email = $request->input('email');
        $password = $request->input('password');

        // check if user exists in DB
        $model = new UserModel();
        $user = $model->where('email', '=', $email)
                      ->whereNull('deleted_at') // ignore deleted users
                      ->first();

        // check is user exists
        if ($user) {
            //if user exists check if password is correct
            if (password_verify($password, $user->password)) {
                $session_data = [
                    'id' => $user->id,
                    'email' => $user->email,
                    'primeiro_nome' => $user->primeiro_nome
                ];
                session()->put($session_data);
                return redirect()->route('home');
            }
        }

        // invalid login
        return redirect()
            ->route('login') // redirect to login route
            ->withInput() // manter os dados preenchidos
            ->with('login_error', 'Login inválido'); // return message
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
            'email.required' => $this->required,
            'email.email' => $this->validEmail,
        ]);


         // Get the email from the request
         $email = $request->input('email');
    
         // Check if the email exists in the database
        $model = new UserModel();
        $user = $model->where('email', '=', $email)
                        ->whereNull('deleted_at') // ignore deleted users
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

